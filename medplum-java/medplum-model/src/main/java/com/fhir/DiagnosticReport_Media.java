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
    as = ImmutableDiagnosticReport_Media.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DiagnosticReport_Media {
  Optional<String> id();

  Reference link();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableDiagnosticReport_Media.LinkBuildStage builder() {
    return ImmutableDiagnosticReport_Media.builder();
  }
}
