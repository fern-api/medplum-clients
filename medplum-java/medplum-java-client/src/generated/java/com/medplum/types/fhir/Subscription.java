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
  Optional<List<Extension>> modifierExtension();

  Subscription_Channel channel();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Instant> end();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<ContactPoint>> contact();

  Optional<String> criteria();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<String> error();

  String resourceType();

  Optional<SubscriptionStatus> status();

  Optional<String> reason();

  static ImmutableSubscription.ChannelBuildStage builder() {
    return ImmutableSubscription.builder();
  }
}
