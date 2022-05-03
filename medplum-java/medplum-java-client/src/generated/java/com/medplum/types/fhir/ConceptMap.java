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
  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<String> sourceCanonical();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<List<UsageContext>> useContext();

  Optional<String> sourceUri();

  Optional<Markdown> copyright();

  Optional<String> name();

  Optional<String> publisher();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> experimental();

  Optional<DateTime> date();

  Optional<List<ConceptMap_Group>> group();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<String> targetCanonical();

  Optional<ConceptmapStatus> status();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> title();

  Optional<String> targetUri();

  Optional<List<ContactDetail>> contact();

  Optional<Uri> url();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  String resourceType();

  static ImmutableConceptMap.ResourceTypeBuildStage builder() {
    return ImmutableConceptMap.builder();
  }
}
