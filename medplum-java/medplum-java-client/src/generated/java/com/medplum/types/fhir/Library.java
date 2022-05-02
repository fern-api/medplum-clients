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
  Optional<LibraryStatus> status();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ContactDetail>> author();

  Optional<String> subtitle();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Identifier>> identifier();

  Optional<String> usage();

  Optional<List<ContactDetail>> editor();

  Optional<Date> approvalDate();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> topic();

  Optional<Code> language();

  Optional<Boolean> experimental();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<Id> id();

  CodeableConcept type();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<Period> effectivePeriod();

  Optional<Reference> subjectReference();

  Optional<Uri> url();

  Optional<List<UsageContext>> useContext();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<String> name();

  Optional<Date> lastReviewDate();

  String resourceType();

  Optional<List<Attachment>> content();

  Optional<Meta> meta();

  Optional<String> publisher();

  Optional<List<ParameterDefinition>> parameter();

  Optional<Markdown> description();

  Optional<Markdown> purpose();

  static ImmutableLibrary.TypeBuildStage builder() {
    return ImmutableLibrary.builder();
  }
}
