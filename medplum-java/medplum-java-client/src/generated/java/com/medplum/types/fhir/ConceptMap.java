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
  Optional<Narrative> text();

  Optional<ConceptmapStatus> status();

  Optional<String> sourceCanonical();

  String resourceType();

  Optional<DateTime> date();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> purpose();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<Identifier> identifier();

  Optional<String> sourceUri();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> copyright();

  Optional<String> targetUri();

  Optional<String> name();

  Optional<Code> language();

  Optional<String> targetCanonical();

  Optional<Meta> meta();

  Optional<List<ConceptMap_Group>> group();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<Uri> url();

  static ImmutableConceptMap.ResourceTypeBuildStage builder() {
    return ImmutableConceptMap.builder();
  }
}
