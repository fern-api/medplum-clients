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
    as = ImmutableVisionPrescription.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VisionPrescription {
  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<DateTime> dateWritten();

  Optional<DateTime> created();

  Reference patient();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<Reference> encounter();

  Optional<Id> id();

  Optional<Narrative> text();

  Reference prescriber();

  Optional<Meta> meta();

  Optional<Code> language();

  List<VisionPrescription_LensSpecification> lensSpecification();

  String resourceType();

  static ImmutableVisionPrescription.PatientBuildStage builder() {
    return ImmutableVisionPrescription.builder();
  }
}
