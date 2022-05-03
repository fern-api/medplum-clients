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
  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> condition();

  Optional<List<Extension>> extension();

  Optional<List<Specimen_Processing>> processing();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<SpecimenStatus> status();

  Optional<Identifier> accessionIdentifier();

  Optional<List<Specimen_Container>> container();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> request();

  Optional<Id> id();

  Optional<Specimen_Collection> collection();

  Optional<Meta> meta();

  Optional<Reference> subject();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Code> language();

  Optional<List<Reference>> parent();

  Optional<DateTime> receivedTime();

  static ImmutableSpecimen.ResourceTypeBuildStage builder() {
    return ImmutableSpecimen.builder();
  }
}
