package com.template.flows

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.InitiatingFlow
import net.corda.core.flows.StartableByRPC

@InitiatingFlow
@StartableByRPC
object ListPropertyFlow {
    class Initiator : FlowLogic<Unit>() {
        @Suspendable
        override fun call() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    class Responder : FlowLogic<Unit>() {
        @Suspendable
        override fun call() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}