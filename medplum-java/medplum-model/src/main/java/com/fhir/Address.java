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
    as = ImmutableAddress.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Address {
  Optional<AddressType> type();

  Optional<AddressUse> use();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<String> city();

  Optional<String> state();

  Optional<String> country();

  Optional<String> district();

  Optional<List<String>> line();

  Optional<Period> period();

  Optional<String> postalCode();

  Optional<String> id();

  static ImmutableAddress.Builder builder() {
    return ImmutableAddress.builder();
  }
}
