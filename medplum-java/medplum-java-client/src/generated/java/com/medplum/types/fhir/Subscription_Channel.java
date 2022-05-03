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
    as = ImmutableSubscription_Channel.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Subscription_Channel {
  Optional<String> id();

  Optional<List<String>> header();

  Optional<Code> payload();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Subscription_channelType> type();

  Optional<Url> endpoint();

  static ImmutableSubscription_Channel.Builder builder() {
    return ImmutableSubscription_Channel.builder();
  }
}
