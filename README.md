# Percolate Java SDK

[![Circle CI](https://circleci.com/gh/percolate/percolate-java-sdk.svg?style=svg)](https://circleci.com/gh/percolate/percolate-java-sdk)
[![codecov.io](https://codecov.io/github/percolate/percolate-java-sdk/coverage.svg?branch=master)](https://codecov.io/github/percolate/percolate-java-sdk?branch=master)

## Usage

The SDK is broken up into 3 libraries:

| Component     | Description                        |
|---------------|------------------------------------| 
| core          | Core objects.  Required.           |
| api           | API requests.                      |
| auth          | Helper OAuth2  objects.            |
| android       | Android-specific objects.          |
| python-bridge | Allows core/api usage from python. |
   

### Using Gradle / Maven
If you are using Gradle or Maven, do the following:

Add jitpack.io as a repository.  [Instructions](https://jitpack.io/docs/#how-to).

To use the latest build, include 1 or more of the following in your `build.gradle` file: 
```
compile 'com.github.percolate.percolate-java-sdk:core:master-SNAPSHOT'
compile 'com.github.percolate.percolate-java-sdk:api:master-SNAPSHOT'
compile 'com.github.percolate.percolate-java-sdk:android:master-SNAPSHOT'
```

To use a build from a specific github commit: `compile 'com.github.percolate.percolate-java-sdk:<core|api|android>:<COMMIT_HASH>'`

### Just want the jar file?
`https://jitpack.io/com/github/percolate/percolate-java-sdk/LIBRARY/COMMIT_HASH/LIBRARY-COMMIT_HASH.jar`
(example: `https://jitpack.iocom/github/percolate/percolate-java-sdk/core/b4c68ed6cf4f539548e435fbd95bbf614c5446be/core-b4c68ed6cf4f539548e435fbd95bbf614c5446be.jar`

### Usage example

Use the `PercolateApi` class to access an API endpoint by name.   For example, `PercolateApi#terms` is used to access
our `v5/terms` endpoint.  You can then call `get()`, `create()`, `update()`, or `delete()` on the returned object.

```java
new PercolateApi(API_KEY)
  .terms()
  .get(params);
```

### Extended Example:
```java
PercolateApi percolateApi = new PercolateApi(API_KEY);
TermsParams params = new TermsParams()
  .scopeId("license:12345")
  .search("abc");
Call<Terms> call = percolateApi.terms().get(params);
Terms terms = call.execute().body();  
...  
```

The returned `Call` objects can be used in 1 of 2 ways:

**Synchronously**
```java
Terms terms = call.execute().body();
```

**Asynchronously**
```java
call.enqueue(new Callback<Terms>() {

    @Override
    public void onResponse(Call<Terms> call, Response<Terms> response) {
        Terms terms = response.body();
        ...
    }

    @Override
    public void onFailure(Call<Terms> call, Throwable t) { }    
});
```

## OAuth2 Authentication
This library supports API_KEY authentication or OAuth2 authentication.
See the [wiki page](wiki/OAuth2-vs-API_KEY-Authentication) for details.

## Usage from Python
This is an experimental feature.
See [python-bridge](python-bridge) for details.

## Contributing
TODO - Project setup, etc

Run the following **Using Java8** to test maven publishing that will be run by jitpack: `./gradlew --info clean install`

## License
Distributed under the BSD 3 license. See [LICENSE](LICENSE.txt) for details.
