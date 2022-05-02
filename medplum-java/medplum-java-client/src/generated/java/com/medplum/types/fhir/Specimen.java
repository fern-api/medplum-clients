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
  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> receivedTime();

  Optional<Meta> meta();

  Optional<List<Annotation>> note();

  Optional<Identifier> accessionIdentifier();

  Optional<SpecimenStatus> status();

  Optional<List<Reference>> request();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> parent();

  Optional<List<Specimen_Container>> container();

  String resourceType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> type();

  Optional<Code> language();

  Optional<List<CodeableConcept>> condition();

  Optional<List<Specimen_Processing>> processing();

  Optional<Reference> subject();

  Optional<Specimen_Collection> collection();

  static ImmutableSpecimen.ResourceTypeBuildStage builder() {
    return ImmutableSpecimen.builder();
  }
}
