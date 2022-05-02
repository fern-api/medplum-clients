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
    as = ImmutableHumanName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HumanName {
  Optional<String> text();

  Optional<HumannameUse> use();

  Optional<String> id();

  Optional<String> family();

  Optional<List<String>> suffix();

  Optional<List<String>> given();

  Optional<Period> period();

  Optional<List<String>> prefix();

  Optional<List<Extension>> extension();

  static ImmutableHumanName.Builder builder() {
    return ImmutableHumanName.builder();
  }
}
