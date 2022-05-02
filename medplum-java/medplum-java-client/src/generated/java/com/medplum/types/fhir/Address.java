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
  Optional<String> state();

  Optional<List<Extension>> extension();

  Optional<String> country();

  Optional<String> id();

  Optional<AddressType> type();

  Optional<List<String>> line();

  Optional<AddressUse> use();

  Optional<String> city();

  Optional<String> district();

  Optional<String> postalCode();

  Optional<Period> period();

  Optional<String> text();

  static ImmutableAddress.Builder builder() {
    return ImmutableAddress.builder();
  }
}
