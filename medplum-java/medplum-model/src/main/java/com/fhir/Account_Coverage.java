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
    as = ImmutableAccount_Coverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Account_Coverage {
  Optional<positiveInt> priority();

  Reference coverage();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableAccount_Coverage.CoverageBuildStage builder() {
    return ImmutableAccount_Coverage.builder();
  }
}
