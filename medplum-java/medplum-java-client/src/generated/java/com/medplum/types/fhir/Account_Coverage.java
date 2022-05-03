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
    as = ImmutableAccount_Coverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Account_Coverage {
  Reference coverage();

  Optional<PositiveInt> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableAccount_Coverage.CoverageBuildStage builder() {
    return ImmutableAccount_Coverage.builder();
  }
}
