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
  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<DateTime> created();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  String resourceType();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  List<VisionPrescription_LensSpecification> lensSpecification();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  Reference patient();

  Optional<DateTime> dateWritten();

  Optional<List<ResourceList>> contained();

  Reference prescriber();

  Optional<Narrative> text();

  Optional<Meta> meta();

  static ImmutableVisionPrescription.ResourceTypeBuildStage builder() {
    return ImmutableVisionPrescription.builder();
  }
}
