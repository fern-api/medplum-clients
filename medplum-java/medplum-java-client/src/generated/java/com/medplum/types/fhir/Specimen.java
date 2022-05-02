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
    as = ImmutableSpecimen.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen {
  Optional<Identifier> accessionIdentifier();

  Optional<List<Specimen_Processing>> processing();

  Optional<Code> language();

  Optional<List<Reference>> parent();

  String resourceType();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> condition();

  Optional<List<Specimen_Container>> container();

  Optional<Specimen_Collection> collection();

  Optional<Uri> implicitRules();

  Optional<DateTime> receivedTime();

  Optional<SpecimenStatus> status();

  Optional<CodeableConcept> type();

  Optional<List<Reference>> request();

  Optional<Narrative> text();

  Optional<Reference> subject();

  static ImmutableSpecimen.ResourceTypeBuildStage builder() {
    return ImmutableSpecimen.builder();
  }
}
