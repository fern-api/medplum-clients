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
    as = ImmutableLibrary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Library {
  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> contact();

  Optional<code> language();

  CodeableConcept type();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> endorser();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<markdown> description();

  Optional<List<ParameterDefinition>> parameter();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> topic();

  Optional<uri> url();

  Optional<date> lastReviewDate();

  Optional<LibraryStatus> status();

  Optional<markdown> purpose();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactDetail>> editor();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<Reference> subjectReference();

  Optional<date> approvalDate();

  Optional<String> usage();

  Optional<List<UsageContext>> useContext();

  Optional<uri> implicitRules();

  Optional<markdown> copyright();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> reviewer();

  Optional<dateTime> date();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> subtitle();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<Period> effectivePeriod();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<String> title();

  Optional<List<Attachment>> content();

  static ImmutableLibrary.TypeBuildStage builder() {
    return ImmutableLibrary.builder();
  }
}
