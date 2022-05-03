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
    as = ImmutableAddress.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Address {
  Optional<String> district();

  Optional<String> id();

  Optional<List<String>> line();

  Optional<String> country();

  Optional<String> postalCode();

  Optional<String> state();

  Optional<Period> period();

  Optional<AddressType> type();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<AddressUse> use();

  Optional<String> city();

  static ImmutableAddress.Builder builder() {
    return ImmutableAddress.builder();
  }
}
