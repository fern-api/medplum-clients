package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<decimal> diameter();

  Optional<decimal> add();

  Optional<String> color();

  Optional<Integer> axis();

  Optional<List<Extension>> extension();

  Optional<decimal> sphere();

  Optional<List<Annotation>> note();

  Optional<Quantity> duration();

  Optional<decimal> power();

  Optional<String> brand();

  CodeableConcept product();

  Optional<Visionprescription_lensspecificationEye> eye();

  Optional<decimal> backCurve();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<VisionPrescription_Prism>> prism();

  Optional<decimal> cylinder();

  static ImmutableVisionPrescription_LensSpecification.ProductBuildStage builder() {
    return ImmutableVisionPrescription_LensSpecification.builder();
  }
}
