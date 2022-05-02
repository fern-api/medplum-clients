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
  Optional<Visionprescription_lensspecificationEye> eye();

  Optional<Decimal> power();

  Optional<Decimal> sphere();

  Optional<String> id();

  Optional<Quantity> duration();

  Optional<String> brand();

  CodeableConcept product();

  Optional<List<VisionPrescription_Prism>> prism();

  Optional<List<Extension>> extension();

  Optional<Decimal> cylinder();

  Optional<Decimal> diameter();

  Optional<Decimal> backCurve();

  Optional<String> color();

  Optional<Integer> axis();

  Optional<Decimal> add();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Annotation>> note();

  static ImmutableVisionPrescription_LensSpecification.ProductBuildStage builder() {
    return ImmutableVisionPrescription_LensSpecification.builder();
  }
}
