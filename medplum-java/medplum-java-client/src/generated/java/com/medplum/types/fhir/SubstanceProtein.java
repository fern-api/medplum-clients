package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceProtein.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceProtein {
  Optional<List<SubstanceProtein_Subunit>> subunit();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> sequenceType();

  Optional<Code> language();

  Optional<Integer> numberOfSubunits();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<String>> disulfideLinkage();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  static ImmutableSubstanceProtein.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceProtein.builder();
  }
}
