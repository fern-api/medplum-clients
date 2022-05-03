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
  Optional<List<Extension>> extension();

  Optional<List<Coding>> category();

  Optional<String> id();

  Optional<List<Coding>> control();

  Optional<List<UnsignedInt>> number();

  Optional<List<Extension>> modifierExtension();

  Coding classification();

  static ImmutableContract_SecurityLabel.ClassificationBuildStage builder() {
    return ImmutableContract_SecurityLabel.builder();
  }
}
