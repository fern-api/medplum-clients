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
  Optional<Integer> axis();

  Optional<Decimal> add();

  Optional<Decimal> power();

  Optional<Decimal> backCurve();

  Optional<List<Extension>> extension();

  Optional<Decimal> sphere();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Annotation>> note();

  CodeableConcept product();

  Optional<Visionprescription_lensspecificationEye> eye();

  Optional<Quantity> duration();

  Optional<String> color();

  Optional<Decimal> cylinder();

  Optional<String> brand();

  Optional<Decimal> diameter();

  Optional<List<VisionPrescription_Prism>> prism();

  static ImmutableVisionPrescription_LensSpecification.ProductBuildStage builder() {
    return ImmutableVisionPrescription_LensSpecification.builder();
  }
}
