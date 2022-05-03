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
    as = ImmutableSearchParameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter {
  Optional<SearchparameterXpathusage> xpathUsage();

  Optional<Canonical> derivedFrom();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<List<SearchparameterModifierItem>> modifier();

  Optional<Boolean> experimental();

  Optional<String> version();

  Optional<Code> language();

  Optional<List<Code>> target();

  Optional<SearchparameterType> type();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<String> expression();

  Optional<Boolean> multipleAnd();

  Optional<Code> code();

  Optional<Meta> meta();

  Optional<List<Code>> base();

  Optional<String> publisher();

  Optional<List<SearchparameterComparatorItem>> comparator();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> description();

  Optional<String> xpath();

  Optional<Boolean> multipleOr();

  Optional<SearchparameterStatus> status();

  Optional<List<SearchParameter_Component>> component();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<Uri> url();

  Optional<List<Extension>> extension();

  Optional<List<String>> chain();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> purpose();

  static ImmutableSearchParameter.ResourceTypeBuildStage builder() {
    return ImmutableSearchParameter.builder();
  }
}
