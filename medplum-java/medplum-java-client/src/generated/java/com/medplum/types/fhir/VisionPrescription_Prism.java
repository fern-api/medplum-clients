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
    as = ImmutableVisionPrescription_Prism.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VisionPrescription_Prism {
  Optional<Decimal> amount();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Visionprescription_prismBase> base();

  static ImmutableVisionPrescription_Prism.Builder builder() {
    return ImmutableVisionPrescription_Prism.builder();
  }
}
