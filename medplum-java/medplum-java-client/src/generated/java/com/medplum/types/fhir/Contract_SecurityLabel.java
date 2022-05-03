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
    as = ImmutableContract_SecurityLabel.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_SecurityLabel {
  Optional<List<Coding>> control();

  Optional<List<Extension>> extension();

  Coding classification();

  Optional<List<UnsignedInt>> number();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Coding>> category();

  static ImmutableContract_SecurityLabel.ClassificationBuildStage builder() {
    return ImmutableContract_SecurityLabel.builder();
  }
}
