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
  Optional<Code> language();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Reference patient();

  Optional<DateTime> created();

  Optional<Reference> encounter();

  Optional<Narrative> text();

  Reference prescriber();

  List<VisionPrescription_LensSpecification> lensSpecification();

  Optional<DateTime> dateWritten();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  static ImmutableVisionPrescription.ResourceTypeBuildStage builder() {
    return ImmutableVisionPrescription.builder();
  }
}
