package com.percolate.sdk.api.request.approvals.workflow.history

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.WorkflowHistoryEvents
import org.junit.Assert
import org.junit.Test

class ApprovalWorkflowHistoryRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val workflowHistory = percolateApi
                .approvalWorkflowHistory()
                .get(ApprovalWorkflowHistoryParams().id("123"))
                .execute()
                .body();

        Assert.assertNotNull(workflowHistory)
        Assert.assertNotNull(workflowHistory.events)
        Assert.assertEquals(2, workflowHistory.events.size.toLong())
    }

    @Test
    fun testCreate() {
        val workflowHistory = percolateApi
                .approvalWorkflowHistory()
                .create(WorkflowHistoryEvents())
                .execute()
                .body();

        Assert.assertNotNull(workflowHistory)
        Assert.assertNotNull(workflowHistory.events)
    }
}
