package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> sourceUri();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<List<ConceptMap_Group>> group();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> targetCanonical();

  Optional<String> title();

  Optional<code> language();

  Optional<Identifier> identifier();

  Optional<List<ResourceList>> contained();

  Optional<String> targetUri();

  Optional<String> sourceCanonical();

  String resourceType();

  Optional<id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<markdown> purpose();

  Optional<markdown> copyright();

  Optional<String> publisher();

  Optional<markdown> description();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> contact();

  Optional<ConceptmapStatus> status();

  Optional<uri> implicitRules();

  Optional<dateTime> date();

  Optional<uri> url();

  Optional<String> name();

  Optional<Narrative> text();

  static ImmutableConceptMap.ResourceTypeBuildStage builder() {
    return ImmutableConceptMap.builder();
  }
}
