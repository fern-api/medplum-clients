package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableConceptMap.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap {
  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<List<ConceptMap_Group>> group();

  Optional<String> name();

  Optional<String> sourceCanonical();

  Optional<String> version();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<String> title();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> contact();

  Optional<String> targetUri();

  Optional<ConceptmapStatus> status();

  Optional<Uri> implicitRules();

  Optional<Markdown> purpose();

  Optional<List<Extension>> extension();

  Optional<String> targetCanonical();

  Optional<String> publisher();

  Optional<String> sourceUri();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> description();

  Optional<Meta> meta();

  String resourceType();

  Optional<Identifier> identifier();

  static ImmutableConceptMap.ResourceTypeBuildStage builder() {
    return ImmutableConceptMap.builder();
  }
}
