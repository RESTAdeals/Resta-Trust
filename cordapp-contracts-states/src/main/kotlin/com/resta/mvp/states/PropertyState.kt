package com.resta.mvp.states

import net.corda.core.contracts.Amount
import net.corda.core.contracts.LinearState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.AbstractParty
import java.util.*

/**
 *  State of the property that has to be stored on the main RESTA TRUST node.
 *  So that any node can search for the available properties.
 */
data class PropertyState(
            val name : String,               // Unique Name of the Property
            val address : String,            // Address of the Property
            val price : Amount<Currency>,    // Amount expects for investment
            val owner : AbstractParty,       // Owner of the Property
            val trustNode : AbstractParty,   // RESTA TRUST node
            override val linearId: UniqueIdentifier = UniqueIdentifier()
) : LinearState {
    override val participants: List<AbstractParty> = listOf(owner, trustNode)      // Required signers.
    // TODO : Add different aspects related to property
}