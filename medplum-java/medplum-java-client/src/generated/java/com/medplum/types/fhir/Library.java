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
  CodeableConcept type();

  Optional<String> name();

  Optional<DateTime> date();

  Optional<Reference> subjectReference();

  Optional<List<Extension>> extension();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> endorser();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<CodeableConcept>> topic();

  Optional<String> version();

  Optional<List<Identifier>> identifier();

  Optional<LibraryStatus> status();

  Optional<String> title();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> reviewer();

  Optional<Meta> meta();

  Optional<Period> effectivePeriod();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Id> id();

  Optional<String> subtitle();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> copyright();

  Optional<List<Attachment>> content();

  Optional<String> publisher();

  Optional<Markdown> purpose();

  String resourceType();

  Optional<Code> language();

  Optional<List<ParameterDefinition>> parameter();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> editor();

  Optional<Uri> url();

  Optional<Boolean> experimental();

  Optional<Uri> implicitRules();

  Optional<String> usage();

  Optional<Date> lastReviewDate();

  Optional<Narrative> text();

  static ImmutableLibrary.TypeBuildStage builder() {
    return ImmutableLibrary.builder();
  }
}
