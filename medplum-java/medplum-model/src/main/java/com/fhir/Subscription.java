package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<SubscriptionStatus> status();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<String> error();

  Subscription_Channel channel();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<String> criteria();

  Optional<id> id();

  Optional<code> language();

  Optional<List<ContactPoint>> contact();

  Optional<String> reason();

  Optional<uri> implicitRules();

  Optional<instant> end();

  static ImmutableSubscription.ResourceTypeBuildStage builder() {
    return ImmutableSubscription.builder();
  }
}
