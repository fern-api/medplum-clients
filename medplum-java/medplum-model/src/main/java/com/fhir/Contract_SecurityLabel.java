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
    as = ImmutableContract_SecurityLabel.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_SecurityLabel {
  Coding classification();

  Optional<List<Coding>> category();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> control();

  Optional<List<unsignedInt>> number();

  Optional<String> id();

  static ImmutableContract_SecurityLabel.ClassificationBuildStage builder() {
    return ImmutableContract_SecurityLabel.builder();
  }
}
