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
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> payload();

  Optional<List<String>> header();

  Optional<Url> endpoint();

  Optional<Subscription_channelType> type();

  Optional<String> id();

  static ImmutableSubscription_Channel.Builder builder() {
    return ImmutableSubscription_Channel.builder();
  }
}
