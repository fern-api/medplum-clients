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
  Optional<Decimal> cylinder();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> axis();

  Optional<Decimal> add();

  Optional<List<Extension>> extension();

  Optional<String> color();

  Optional<Decimal> sphere();

  Optional<Decimal> power();

  Optional<Decimal> diameter();

  Optional<Quantity> duration();

  Optional<String> id();

  Optional<List<Annotation>> note();

  Optional<List<VisionPrescription_Prism>> prism();

  CodeableConcept product();

  Optional<String> brand();

  Optional<Decimal> backCurve();

  Optional<Visionprescription_lensspecificationEye> eye();

  static ImmutableVisionPrescription_LensSpecification.ProductBuildStage builder() {
    return ImmutableVisionPrescription_LensSpecification.builder();
  }
}
