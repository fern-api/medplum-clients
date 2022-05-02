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
    as = ImmutableDiagnosticReport_Media.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DiagnosticReport_Media {
  Optional<String> id();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Reference link();

  static ImmutableDiagnosticReport_Media.LinkBuildStage builder() {
    return ImmutableDiagnosticReport_Media.builder();
  }
}
