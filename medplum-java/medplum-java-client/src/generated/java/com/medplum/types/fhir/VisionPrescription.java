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

  Reference prescriber();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Code> status();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<DateTime> dateWritten();

  Reference patient();

  String resourceType();

  Optional<Uri> implicitRules();

  List<VisionPrescription_LensSpecification> lensSpecification();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> encounter();

  Optional<DateTime> created();

  Optional<Meta> meta();

  static ImmutableVisionPrescription.PrescriberBuildStage builder() {
    return ImmutableVisionPrescription.builder();
  }
}
