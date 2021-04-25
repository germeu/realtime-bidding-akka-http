package com.rtb

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import com.rtb.dao.Payloads.{BidRequest, BidResponse, Campaign, HttpResponse}

/**
 * Igbalajobi Jamiu.
 */
object BiddingRegistry {

  /**
   * Actor-Typed Behaviour trait
   */
  sealed trait Command


  final case class GetBidding(userBidRequest: BidRequest, replyTo: ActorRef[HttpResponse[BidResponse]]) extends Command

  final case class GetCampaigns(replyTo: ActorRef[HttpResponse[Seq[Campaign]]]) extends Command

  def apply(): Behavior[Command] = Behaviors.receiveMessage {
    case GetCampaigns(replyTo) => ???
    case GetBidding(bidRequest, replyTo) => ???
  }

}