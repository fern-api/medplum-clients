package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<code> status();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  List<VisionPrescription_LensSpecification> lensSpecification();

  Optional<List<Extension>> extension();

  Optional<dateTime> created();

  Optional<dateTime> dateWritten();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<code> language();

  Reference prescriber();

  String resourceType();

  Reference patient();

  Optional<id> id();

  static ImmutableVisionPrescription.PrescriberBuildStage builder() {
    return ImmutableVisionPrescription.builder();
  }
}
