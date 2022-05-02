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
  Optional<Markdown> description();

  Optional<Markdown> copyright();

  Optional<Code> language();

  Optional<Markdown> purpose();

  Optional<String> sourceCanonical();

  Optional<Narrative> text();

  Optional<ConceptmapStatus> status();

  Optional<Id> id();

  Optional<String> name();

  Optional<DateTime> date();

  Optional<String> title();

  Optional<List<ContactDetail>> contact();

  Optional<Uri> implicitRules();

  Optional<String> version();

  Optional<String> sourceUri();

  Optional<List<Extension>> extension();

  Optional<String> targetUri();

  String resourceType();

  Optional<Uri> url();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  Optional<String> publisher();

  Optional<String> targetCanonical();

  Optional<List<ConceptMap_Group>> group();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> jurisdiction();

  static ImmutableConceptMap.ResourceTypeBuildStage builder() {
    return ImmutableConceptMap.builder();
  }
}
