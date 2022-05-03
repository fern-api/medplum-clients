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
  Optional<List<Extension>> extension();

  Optional<AddressType> type();

  Optional<String> district();

  Optional<String> text();

  Optional<String> city();

  Optional<String> id();

  Optional<String> country();

  Optional<Period> period();

  Optional<AddressUse> use();

  Optional<String> postalCode();

  Optional<List<String>> line();

  Optional<String> state();

  static ImmutableAddress.Builder builder() {
    return ImmutableAddress.builder();
  }
}
