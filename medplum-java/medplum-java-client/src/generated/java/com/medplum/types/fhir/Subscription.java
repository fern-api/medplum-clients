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
  Optional<Uri> implicitRules();

  Optional<SubscriptionStatus> status();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<String> criteria();

  Optional<Instant> end();

  String resourceType();

  Optional<String> error();

  Optional<String> reason();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Subscription_Channel channel();

  Optional<Id> id();

  Optional<List<ContactPoint>> contact();

  static ImmutableSubscription.ResourceTypeBuildStage builder() {
    return ImmutableSubscription.builder();
  }
}
