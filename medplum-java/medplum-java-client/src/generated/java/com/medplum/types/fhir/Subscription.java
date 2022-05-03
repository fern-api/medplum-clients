package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubscription.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Subscription {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<SubscriptionStatus> status();

  Optional<String> reason();

  Optional<String> criteria();

  Optional<List<ResourceList>> contained();

  Subscription_Channel channel();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<String> error();

  String resourceType();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Instant> end();

  Optional<List<ContactPoint>> contact();

  Optional<Id> id();

  static ImmutableSubscription.ChannelBuildStage builder() {
    return ImmutableSubscription.builder();
  }
}
