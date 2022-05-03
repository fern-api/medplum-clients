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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<String>> given();

  Optional<List<String>> suffix();

  Optional<List<String>> prefix();

  Optional<Period> period();

  Optional<String> family();

  Optional<HumannameUse> use();

  Optional<String> text();

  static ImmutableHumanName.Builder builder() {
    return ImmutableHumanName.builder();
  }
}
