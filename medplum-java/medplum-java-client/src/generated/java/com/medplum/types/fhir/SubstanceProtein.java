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
  Optional<Code> language();

  Optional<Integer> numberOfSubunits();

  Optional<List<String>> disulfideLinkage();

  Optional<CodeableConcept> sequenceType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstanceProtein_Subunit>> subunit();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  static ImmutableSubstanceProtein.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceProtein.builder();
  }
}
