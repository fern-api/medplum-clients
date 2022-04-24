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
    as = ImmutableSubscription_Channel.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Subscription_Channel {
  Optional<List<String>> header();

  Optional<Subscription_channelType> type();

  Optional<code> payload();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<url> endpoint();

  static ImmutableSubscription_Channel.Builder builder() {
    return ImmutableSubscription_Channel.builder();
  }
}
