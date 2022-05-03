package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableVisionPrescription_LensSpecification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VisionPrescription_LensSpecification {
  Optional<String> color();

  Optional<Decimal> diameter();

  Optional<Integer> axis();

  Optional<Quantity> duration();

  Optional<String> id();

  Optional<Visionprescription_lensspecificationEye> eye();

  Optional<String> brand();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept product();

  Optional<List<VisionPrescription_Prism>> prism();

  Optional<List<Extension>> extension();

  Optional<Decimal> sphere();

  Optional<Decimal> backCurve();

  Optional<List<Annotation>> note();

  Optional<Decimal> add();

  Optional<Decimal> cylinder();

  Optional<Decimal> power();

  static ImmutableVisionPrescription_LensSpecification.ProductBuildStage builder() {
    return ImmutableVisionPrescription_LensSpecification.builder();
  }
}
