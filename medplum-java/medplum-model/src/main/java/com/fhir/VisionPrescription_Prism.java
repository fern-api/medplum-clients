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
    as = ImmutableVisionPrescription_Prism.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VisionPrescription_Prism {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Visionprescription_prismBase> base();

  Optional<decimal> amount();

  static ImmutableVisionPrescription_Prism.Builder builder() {
    return ImmutableVisionPrescription_Prism.builder();
  }
}
