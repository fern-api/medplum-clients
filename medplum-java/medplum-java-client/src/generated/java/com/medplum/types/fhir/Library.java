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
    as = ImmutableLibrary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Library {
  Optional<Period> effectivePeriod();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Boolean> experimental();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<List<ResourceList>> contained();

  Optional<Date> approvalDate();

  Optional<List<UsageContext>> useContext();

  Optional<List<Attachment>> content();

  Optional<DateTime> date();

  Optional<Date> lastReviewDate();

  Optional<Markdown> purpose();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> contact();

  Optional<Code> language();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<String> subtitle();

  Optional<Uri> url();

  Optional<List<ContactDetail>> editor();

  Optional<Narrative> text();

  Optional<LibraryStatus> status();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<String> title();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> reviewer();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<Reference> subjectReference();

  Optional<String> publisher();

  Optional<String> usage();

  Optional<String> name();

  CodeableConcept type();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Markdown> description();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ParameterDefinition>> parameter();

  static ImmutableLibrary.ResourceTypeBuildStage builder() {
    return ImmutableLibrary.builder();
  }
}
