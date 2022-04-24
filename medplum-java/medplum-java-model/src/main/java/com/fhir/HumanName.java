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
    as = ImmutableHumanName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HumanName {
  Optional<List<String>> suffix();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<String> family();

  Optional<List<String>> given();

  Optional<HumannameUse> use();

  Optional<String> id();

  Optional<List<String>> prefix();

  Optional<Period> period();

  static ImmutableHumanName.Builder builder() {
    return ImmutableHumanName.builder();
  }
}
