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
  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Instant> end();

  Optional<String> reason();

  Optional<List<ResourceList>> contained();

  Optional<SubscriptionStatus> status();

  Optional<List<ContactPoint>> contact();

  String resourceType();

  Subscription_Channel channel();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<String> error();

  Optional<Code> language();

  Optional<String> criteria();

  Optional<Meta> meta();

  static ImmutableSubscription.ResourceTypeBuildStage builder() {
    return ImmutableSubscription.builder();
  }
}
