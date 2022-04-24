//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link JsonWebKey}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJsonWebKey.builder()}.
 */
@org.immutables.value.Generated(from = "JsonWebKey", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJsonWebKey implements com.fhir.JsonWebKey {
  private final @javax.annotation.Nullable java.lang.String qi;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String dq;
  private final @javax.annotation.Nullable java.lang.String kid;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> x5c;
  private final @javax.annotation.Nullable java.lang.String alg;
  private final @javax.annotation.Nullable java.lang.String n;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String x5t;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String dp;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> key_ops;
  private final @javax.annotation.Nullable java.lang.String p;
  private final @javax.annotation.Nullable java.lang.String q;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String use;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.String kty;
  private final @javax.annotation.Nullable java.lang.String e;
  private final @javax.annotation.Nullable java.lang.String d;

  private ImmutableJsonWebKey(
      @javax.annotation.Nullable java.lang.String qi,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String dq,
      @javax.annotation.Nullable java.lang.String kid,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<java.lang.String> x5c,
      @javax.annotation.Nullable java.lang.String alg,
      @javax.annotation.Nullable java.lang.String n,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String x5t,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String dp,
      @javax.annotation.Nullable java.util.List<java.lang.String> key_ops,
      @javax.annotation.Nullable java.lang.String p,
      @javax.annotation.Nullable java.lang.String q,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String use,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.String kty,
      @javax.annotation.Nullable java.lang.String e,
      @javax.annotation.Nullable java.lang.String d) {
    this.qi = qi;
    this.implicitRules = implicitRules;
    this.dq = dq;
    this.kid = kid;
    this.active = active;
    this.x5c = x5c;
    this.alg = alg;
    this.n = n;
    this.meta = meta;
    this.x5t = x5t;
    this.language = language;
    this.dp = dp;
    this.key_ops = key_ops;
    this.p = p;
    this.q = q;
    this.id = id;
    this.use = use;
    this.resourceType = resourceType;
    this.kty = kty;
    this.e = e;
    this.d = d;
  }

  /**
   * @return The value of the {@code qi} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qi")
  @Override
  public java.util.Optional<java.lang.String> qi() {
    return java.util.Optional.ofNullable(qi);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code dq} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dq")
  @Override
  public java.util.Optional<java.lang.String> dq() {
    return java.util.Optional.ofNullable(dq);
  }

  /**
   * @return The value of the {@code kid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kid")
  @Override
  public java.util.Optional<java.lang.String> kid() {
    return java.util.Optional.ofNullable(kid);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code x5c} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("x5c")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> x5c() {
    return java.util.Optional.ofNullable(x5c);
  }

  /**
   * @return The value of the {@code alg} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alg")
  @Override
  public java.util.Optional<java.lang.String> alg() {
    return java.util.Optional.ofNullable(alg);
  }

  /**
   * @return The value of the {@code n} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("n")
  @Override
  public java.util.Optional<java.lang.String> n() {
    return java.util.Optional.ofNullable(n);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code x5t} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("x5t")
  @Override
  public java.util.Optional<java.lang.String> x5t() {
    return java.util.Optional.ofNullable(x5t);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code dp} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dp")
  @Override
  public java.util.Optional<java.lang.String> dp() {
    return java.util.Optional.ofNullable(dp);
  }

  /**
   * @return The value of the {@code key_ops} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> key_ops() {
    return java.util.Optional.ofNullable(key_ops);
  }

  /**
   * @return The value of the {@code p} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("p")
  @Override
  public java.util.Optional<java.lang.String> p() {
    return java.util.Optional.ofNullable(p);
  }

  /**
   * @return The value of the {@code q} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("q")
  @Override
  public java.util.Optional<java.lang.String> q() {
    return java.util.Optional.ofNullable(q);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<java.lang.String> use() {
    return java.util.Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code kty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kty")
  @Override
  public java.util.Optional<java.lang.String> kty() {
    return java.util.Optional.ofNullable(kty);
  }

  /**
   * @return The value of the {@code e} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("e")
  @Override
  public java.util.Optional<java.lang.String> e() {
    return java.util.Optional.ofNullable(e);
  }

  /**
   * @return The value of the {@code d} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("d")
  @Override
  public java.util.Optional<java.lang.String> d() {
    return java.util.Optional.ofNullable(d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#qi() qi} attribute.
   * @param value The value for qi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQi(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "qi");
    if (java.util.Objects.equals(this.qi, newValue)) return this;
    return new ImmutableJsonWebKey(
        newValue,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#qi() qi} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQi(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.qi, value)) return this;
    return new ImmutableJsonWebKey(
        value,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        newValue,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        value,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#dq() dq} attribute.
   * @param value The value for dq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDq(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "dq");
    if (java.util.Objects.equals(this.dq, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        newValue,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#dq() dq} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDq(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.dq, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        value,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#kid() kid} attribute.
   * @param value The value for kid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKid(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "kid");
    if (java.util.Objects.equals(this.kid, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        newValue,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#kid() kid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKid(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.kid, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        value,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        newValue,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        value,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#x5c() x5c} attribute.
   * @param value The value for x5c
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5c(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "x5c");
    if (this.x5c == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        newValue,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#x5c() x5c} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for x5c
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withX5c(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.x5c == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        value,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#alg() alg} attribute.
   * @param value The value for alg
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withAlg(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "alg");
    if (java.util.Objects.equals(this.alg, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        newValue,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#alg() alg} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alg
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withAlg(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.alg, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        value,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#n() n} attribute.
   * @param value The value for n
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withN(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "n");
    if (java.util.Objects.equals(this.n, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        newValue,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#n() n} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for n
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withN(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.n, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        value,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        newValue,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        value,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#x5t() x5t} attribute.
   * @param value The value for x5t
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5t(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "x5t");
    if (java.util.Objects.equals(this.x5t, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        newValue,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#x5t() x5t} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for x5t
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5t(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.x5t, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        value,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        newValue,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        value,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#dp() dp} attribute.
   * @param value The value for dp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDp(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "dp");
    if (java.util.Objects.equals(this.dp, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        newValue,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#dp() dp} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDp(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.dp, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        value,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#key_ops() key_ops} attribute.
   * @param value The value for key_ops
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKey_ops(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "key_ops");
    if (this.key_ops == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        newValue,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#key_ops() key_ops} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for key_ops
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withKey_ops(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.key_ops == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        value,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#p() p} attribute.
   * @param value The value for p
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withP(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "p");
    if (java.util.Objects.equals(this.p, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        newValue,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#p() p} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for p
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withP(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.p, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        value,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#q() q} attribute.
   * @param value The value for q
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQ(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "q");
    if (java.util.Objects.equals(this.q, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        newValue,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#q() q} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for q
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQ(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.q, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        value,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        newValue,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        value,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withUse(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "use");
    if (java.util.Objects.equals(this.use, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        newValue,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#use() use} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withUse(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.use, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        value,
        this.resourceType,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        newValue,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        value,
        this.kty,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#kty() kty} attribute.
   * @param value The value for kty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKty(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "kty");
    if (java.util.Objects.equals(this.kty, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        newValue,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#kty() kty} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKty(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.kty, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        value,
        this.e,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#e() e} attribute.
   * @param value The value for e
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withE(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "e");
    if (java.util.Objects.equals(this.e, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        newValue,
        this.d);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#e() e} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for e
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withE(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.e, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        value,
        this.d);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#d() d} attribute.
   * @param value The value for d
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withD(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "d");
    if (java.util.Objects.equals(this.d, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#d() d} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for d
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withD(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.d, value)) return this;
    return new ImmutableJsonWebKey(
        this.qi,
        this.implicitRules,
        this.dq,
        this.kid,
        this.active,
        this.x5c,
        this.alg,
        this.n,
        this.meta,
        this.x5t,
        this.language,
        this.dp,
        this.key_ops,
        this.p,
        this.q,
        this.id,
        this.use,
        this.resourceType,
        this.kty,
        this.e,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJsonWebKey} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJsonWebKey
        && equalTo((ImmutableJsonWebKey) another);
  }

  private boolean equalTo(ImmutableJsonWebKey another) {
    return java.util.Objects.equals(qi, another.qi)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(dq, another.dq)
        && java.util.Objects.equals(kid, another.kid)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(x5c, another.x5c)
        && java.util.Objects.equals(alg, another.alg)
        && java.util.Objects.equals(n, another.n)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(x5t, another.x5t)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(dp, another.dp)
        && java.util.Objects.equals(key_ops, another.key_ops)
        && java.util.Objects.equals(p, another.p)
        && java.util.Objects.equals(q, another.q)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(kty, another.kty)
        && java.util.Objects.equals(e, another.e)
        && java.util.Objects.equals(d, another.d);
  }

  /**
   * Computes a hash code from attributes: {@code qi}, {@code implicitRules}, {@code dq}, {@code kid}, {@code active}, {@code x5c}, {@code alg}, {@code n}, {@code meta}, {@code x5t}, {@code language}, {@code dp}, {@code key_ops}, {@code p}, {@code q}, {@code id}, {@code use}, {@code resourceType}, {@code kty}, {@code e}, {@code d}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(qi);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(dq);
    h += (h << 5) + java.util.Objects.hashCode(kid);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(x5c);
    h += (h << 5) + java.util.Objects.hashCode(alg);
    h += (h << 5) + java.util.Objects.hashCode(n);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(x5t);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(dp);
    h += (h << 5) + java.util.Objects.hashCode(key_ops);
    h += (h << 5) + java.util.Objects.hashCode(p);
    h += (h << 5) + java.util.Objects.hashCode(q);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(kty);
    h += (h << 5) + java.util.Objects.hashCode(e);
    h += (h << 5) + java.util.Objects.hashCode(d);
    return h;
  }

  /**
   * Prints the immutable value {@code JsonWebKey} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("JsonWebKey{");
    if (qi != null) {
      builder.append("qi=").append(qi);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (dq != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("dq=").append(dq);
    }
    if (kid != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("kid=").append(kid);
    }
    if (active != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (x5c != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("x5c=").append(x5c);
    }
    if (alg != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("alg=").append(alg);
    }
    if (n != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("n=").append(n);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (x5t != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("x5t=").append(x5t);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (dp != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("dp=").append(dp);
    }
    if (key_ops != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("key_ops=").append(key_ops);
    }
    if (p != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("p=").append(p);
    }
    if (q != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("q=").append(q);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (use != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (resourceType != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (kty != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("kty=").append(kty);
    }
    if (e != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("e=").append(e);
    }
    if (d != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("d=").append(d);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "JsonWebKey", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.JsonWebKey {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> qi = java.util.Optional.empty();
    boolean qiIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> dq = java.util.Optional.empty();
    boolean dqIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> kid = java.util.Optional.empty();
    boolean kidIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> x5c = java.util.Optional.empty();
    boolean x5cIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> alg = java.util.Optional.empty();
    boolean algIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> n = java.util.Optional.empty();
    boolean nIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> x5t = java.util.Optional.empty();
    boolean x5tIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> dp = java.util.Optional.empty();
    boolean dpIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> key_ops = java.util.Optional.empty();
    boolean key_opsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> p = java.util.Optional.empty();
    boolean pIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> q = java.util.Optional.empty();
    boolean qIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> kty = java.util.Optional.empty();
    boolean ktyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> e = java.util.Optional.empty();
    boolean eIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> d = java.util.Optional.empty();
    boolean dIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("qi")
    public void setQi(java.util.Optional<java.lang.String> qi) {
      this.qi = qi;
      this.qiIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dq")
    public void setDq(java.util.Optional<java.lang.String> dq) {
      this.dq = dq;
      this.dqIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kid")
    public void setKid(java.util.Optional<java.lang.String> kid) {
      this.kid = kid;
      this.kidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("x5c")
    public void setX5c(java.util.Optional<java.util.List<java.lang.String>> x5c) {
      this.x5c = x5c;
      this.x5cIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    public void setAlg(java.util.Optional<java.lang.String> alg) {
      this.alg = alg;
      this.algIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    public void setN(java.util.Optional<java.lang.String> n) {
      this.n = n;
      this.nIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("x5t")
    public void setX5t(java.util.Optional<java.lang.String> x5t) {
      this.x5t = x5t;
      this.x5tIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dp")
    public void setDp(java.util.Optional<java.lang.String> dp) {
      this.dp = dp;
      this.dpIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
    public void setKey_ops(java.util.Optional<java.util.List<java.lang.String>> key_ops) {
      this.key_ops = key_ops;
      this.key_opsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("p")
    public void setP(java.util.Optional<java.lang.String> p) {
      this.p = p;
      this.pIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("q")
    public void setQ(java.util.Optional<java.lang.String> q) {
      this.q = q;
      this.qIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<java.lang.String> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    public void setKty(java.util.Optional<java.lang.String> kty) {
      this.kty = kty;
      this.ktyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    public void setE(java.util.Optional<java.lang.String> e) {
      this.e = e;
      this.eIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("d")
    public void setD(java.util.Optional<java.lang.String> d) {
      this.d = d;
      this.dIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> qi() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> dq() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> kid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> x5c() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> alg() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> n() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> x5t() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> dp() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> key_ops() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> p() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> q() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> kty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> e() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> d() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableJsonWebKey fromJson(Json json) {
    ImmutableJsonWebKey.Builder builder = ImmutableJsonWebKey.builder();
    if (json.qiIsSet) {
      builder.qi(json.qi);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.dqIsSet) {
      builder.dq(json.dq);
    }
    if (json.kidIsSet) {
      builder.kid(json.kid);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.x5cIsSet) {
      builder.x5c(json.x5c);
    }
    if (json.algIsSet) {
      builder.alg(json.alg);
    }
    if (json.nIsSet) {
      builder.n(json.n);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.x5tIsSet) {
      builder.x5t(json.x5t);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dpIsSet) {
      builder.dp(json.dp);
    }
    if (json.key_opsIsSet) {
      builder.key_ops(json.key_ops);
    }
    if (json.pIsSet) {
      builder.p(json.p);
    }
    if (json.qIsSet) {
      builder.q(json.q);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.ktyIsSet) {
      builder.kty(json.kty);
    }
    if (json.eIsSet) {
      builder.e(json.e);
    }
    if (json.dIsSet) {
      builder.d(json.d);
    }
    return (ImmutableJsonWebKey) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JsonWebKey} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JsonWebKey instance
   */
  public static JsonWebKey copyOf(JsonWebKey instance) {
    if (instance instanceof ImmutableJsonWebKey) {
      return (ImmutableJsonWebKey) instance;
    }
    return ImmutableJsonWebKey.builder()
        .qi(instance.qi())
        .implicitRules(instance.implicitRules())
        .dq(instance.dq())
        .kid(instance.kid())
        .active(instance.active())
        .x5c(instance.x5c())
        .alg(instance.alg())
        .n(instance.n())
        .meta(instance.meta())
        .x5t(instance.x5t())
        .language(instance.language())
        .dp(instance.dp())
        .key_ops(instance.key_ops())
        .p(instance.p())
        .q(instance.q())
        .id(instance.id())
        .use(instance.use())
        .resourceType(instance.resourceType())
        .kty(instance.kty())
        .e(instance.e())
        .d(instance.d())
        .build();
  }

  /**
   * Creates a builder for {@link JsonWebKey JsonWebKey}.
   * <pre>
   * ImmutableJsonWebKey.builder()
   *    .qi(String) // optional {@link JsonWebKey#qi() qi}
   *    .implicitRules(com.fhir.uri) // optional {@link JsonWebKey#implicitRules() implicitRules}
   *    .dq(String) // optional {@link JsonWebKey#dq() dq}
   *    .kid(String) // optional {@link JsonWebKey#kid() kid}
   *    .active(Boolean) // optional {@link JsonWebKey#active() active}
   *    .x5c(List&amp;lt;String&amp;gt;) // optional {@link JsonWebKey#x5c() x5c}
   *    .alg(String) // optional {@link JsonWebKey#alg() alg}
   *    .n(String) // optional {@link JsonWebKey#n() n}
   *    .meta(com.fhir.Meta) // optional {@link JsonWebKey#meta() meta}
   *    .x5t(String) // optional {@link JsonWebKey#x5t() x5t}
   *    .language(com.fhir.code) // optional {@link JsonWebKey#language() language}
   *    .dp(String) // optional {@link JsonWebKey#dp() dp}
   *    .key_ops(List&amp;lt;String&amp;gt;) // optional {@link JsonWebKey#key_ops() key_ops}
   *    .p(String) // optional {@link JsonWebKey#p() p}
   *    .q(String) // optional {@link JsonWebKey#q() q}
   *    .id(com.fhir.id) // optional {@link JsonWebKey#id() id}
   *    .use(String) // optional {@link JsonWebKey#use() use}
   *    .resourceType(String) // optional {@link JsonWebKey#resourceType() resourceType}
   *    .kty(String) // optional {@link JsonWebKey#kty() kty}
   *    .e(String) // optional {@link JsonWebKey#e() e}
   *    .d(String) // optional {@link JsonWebKey#d() d}
   *    .build();
   * </pre>
   * @return A new JsonWebKey builder
   */
  public static ImmutableJsonWebKey.Builder builder() {
    return new ImmutableJsonWebKey.Builder();
  }

  /**
   * Builds instances of type {@link JsonWebKey JsonWebKey}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "JsonWebKey", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_QI = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_DQ = 0x4L;
    private static final long OPT_BIT_KID = 0x8L;
    private static final long OPT_BIT_ACTIVE = 0x10L;
    private static final long OPT_BIT_X5C = 0x20L;
    private static final long OPT_BIT_ALG = 0x40L;
    private static final long OPT_BIT_N = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_X5T = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_DP = 0x800L;
    private static final long OPT_BIT_KEY_OPS = 0x1000L;
    private static final long OPT_BIT_P = 0x2000L;
    private static final long OPT_BIT_Q = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_USE = 0x10000L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x20000L;
    private static final long OPT_BIT_KTY = 0x40000L;
    private static final long OPT_BIT_E = 0x80000L;
    private static final long OPT_BIT_D = 0x100000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String qi;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String dq;
    private @javax.annotation.Nullable java.lang.String kid;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<java.lang.String> x5c;
    private @javax.annotation.Nullable java.lang.String alg;
    private @javax.annotation.Nullable java.lang.String n;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String x5t;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String dp;
    private @javax.annotation.Nullable java.util.List<java.lang.String> key_ops;
    private @javax.annotation.Nullable java.lang.String p;
    private @javax.annotation.Nullable java.lang.String q;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String use;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.String kty;
    private @javax.annotation.Nullable java.lang.String e;
    private @javax.annotation.Nullable java.lang.String d;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link JsonWebKey#qi() qi} to qi.
     * @param qi The value for qi
     * @return {@code this} builder for chained invocation
     */
    public final Builder qi(java.lang.String qi) {
      checkNotIsSet(qiIsSet(), "qi");
      this.qi = java.util.Objects.requireNonNull(qi, "qi");
      optBits |= OPT_BIT_QI;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#qi() qi} to qi.
     * @param qi The value for qi
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qi")
    public final Builder qi(java.util.Optional<java.lang.String> qi) {
      checkNotIsSet(qiIsSet(), "qi");
      this.qi = qi.orElse(null);
      optBits |= OPT_BIT_QI;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dq() dq} to dq.
     * @param dq The value for dq
     * @return {@code this} builder for chained invocation
     */
    public final Builder dq(java.lang.String dq) {
      checkNotIsSet(dqIsSet(), "dq");
      this.dq = java.util.Objects.requireNonNull(dq, "dq");
      optBits |= OPT_BIT_DQ;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dq() dq} to dq.
     * @param dq The value for dq
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dq")
    public final Builder dq(java.util.Optional<java.lang.String> dq) {
      checkNotIsSet(dqIsSet(), "dq");
      this.dq = dq.orElse(null);
      optBits |= OPT_BIT_DQ;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kid() kid} to kid.
     * @param kid The value for kid
     * @return {@code this} builder for chained invocation
     */
    public final Builder kid(java.lang.String kid) {
      checkNotIsSet(kidIsSet(), "kid");
      this.kid = java.util.Objects.requireNonNull(kid, "kid");
      optBits |= OPT_BIT_KID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kid() kid} to kid.
     * @param kid The value for kid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kid")
    public final Builder kid(java.util.Optional<java.lang.String> kid) {
      checkNotIsSet(kidIsSet(), "kid");
      this.kid = kid.orElse(null);
      optBits |= OPT_BIT_KID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5c() x5c} to x5c.
     * @param x5c The value for x5c
     * @return {@code this} builder for chained invocation
     */
    public final Builder x5c(java.util.List<java.lang.String> x5c) {
      checkNotIsSet(x5cIsSet(), "x5c");
      this.x5c = java.util.Objects.requireNonNull(x5c, "x5c");
      optBits |= OPT_BIT_X5C;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5c() x5c} to x5c.
     * @param x5c The value for x5c
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("x5c")
    public final Builder x5c(java.util.Optional<? extends java.util.List<java.lang.String>> x5c) {
      checkNotIsSet(x5cIsSet(), "x5c");
      this.x5c = x5c.orElse(null);
      optBits |= OPT_BIT_X5C;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#alg() alg} to alg.
     * @param alg The value for alg
     * @return {@code this} builder for chained invocation
     */
    public final Builder alg(java.lang.String alg) {
      checkNotIsSet(algIsSet(), "alg");
      this.alg = java.util.Objects.requireNonNull(alg, "alg");
      optBits |= OPT_BIT_ALG;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#alg() alg} to alg.
     * @param alg The value for alg
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    public final Builder alg(java.util.Optional<java.lang.String> alg) {
      checkNotIsSet(algIsSet(), "alg");
      this.alg = alg.orElse(null);
      optBits |= OPT_BIT_ALG;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#n() n} to n.
     * @param n The value for n
     * @return {@code this} builder for chained invocation
     */
    public final Builder n(java.lang.String n) {
      checkNotIsSet(nIsSet(), "n");
      this.n = java.util.Objects.requireNonNull(n, "n");
      optBits |= OPT_BIT_N;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#n() n} to n.
     * @param n The value for n
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    public final Builder n(java.util.Optional<java.lang.String> n) {
      checkNotIsSet(nIsSet(), "n");
      this.n = n.orElse(null);
      optBits |= OPT_BIT_N;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5t() x5t} to x5t.
     * @param x5t The value for x5t
     * @return {@code this} builder for chained invocation
     */
    public final Builder x5t(java.lang.String x5t) {
      checkNotIsSet(x5tIsSet(), "x5t");
      this.x5t = java.util.Objects.requireNonNull(x5t, "x5t");
      optBits |= OPT_BIT_X5T;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5t() x5t} to x5t.
     * @param x5t The value for x5t
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("x5t")
    public final Builder x5t(java.util.Optional<java.lang.String> x5t) {
      checkNotIsSet(x5tIsSet(), "x5t");
      this.x5t = x5t.orElse(null);
      optBits |= OPT_BIT_X5T;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dp() dp} to dp.
     * @param dp The value for dp
     * @return {@code this} builder for chained invocation
     */
    public final Builder dp(java.lang.String dp) {
      checkNotIsSet(dpIsSet(), "dp");
      this.dp = java.util.Objects.requireNonNull(dp, "dp");
      optBits |= OPT_BIT_DP;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dp() dp} to dp.
     * @param dp The value for dp
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dp")
    public final Builder dp(java.util.Optional<java.lang.String> dp) {
      checkNotIsSet(dpIsSet(), "dp");
      this.dp = dp.orElse(null);
      optBits |= OPT_BIT_DP;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#key_ops() key_ops} to key_ops.
     * @param key_ops The value for key_ops
     * @return {@code this} builder for chained invocation
     */
    public final Builder key_ops(java.util.List<java.lang.String> key_ops) {
      checkNotIsSet(key_opsIsSet(), "key_ops");
      this.key_ops = java.util.Objects.requireNonNull(key_ops, "key_ops");
      optBits |= OPT_BIT_KEY_OPS;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#key_ops() key_ops} to key_ops.
     * @param key_ops The value for key_ops
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
    public final Builder key_ops(java.util.Optional<? extends java.util.List<java.lang.String>> key_ops) {
      checkNotIsSet(key_opsIsSet(), "key_ops");
      this.key_ops = key_ops.orElse(null);
      optBits |= OPT_BIT_KEY_OPS;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#p() p} to p.
     * @param p The value for p
     * @return {@code this} builder for chained invocation
     */
    public final Builder p(java.lang.String p) {
      checkNotIsSet(pIsSet(), "p");
      this.p = java.util.Objects.requireNonNull(p, "p");
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#p() p} to p.
     * @param p The value for p
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("p")
    public final Builder p(java.util.Optional<java.lang.String> p) {
      checkNotIsSet(pIsSet(), "p");
      this.p = p.orElse(null);
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#q() q} to q.
     * @param q The value for q
     * @return {@code this} builder for chained invocation
     */
    public final Builder q(java.lang.String q) {
      checkNotIsSet(qIsSet(), "q");
      this.q = java.util.Objects.requireNonNull(q, "q");
      optBits |= OPT_BIT_Q;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#q() q} to q.
     * @param q The value for q
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("q")
    public final Builder q(java.util.Optional<java.lang.String> q) {
      checkNotIsSet(qIsSet(), "q");
      this.q = q.orElse(null);
      optBits |= OPT_BIT_Q;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(java.lang.String use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<java.lang.String> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.util.Optional<java.lang.String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kty() kty} to kty.
     * @param kty The value for kty
     * @return {@code this} builder for chained invocation
     */
    public final Builder kty(java.lang.String kty) {
      checkNotIsSet(ktyIsSet(), "kty");
      this.kty = java.util.Objects.requireNonNull(kty, "kty");
      optBits |= OPT_BIT_KTY;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kty() kty} to kty.
     * @param kty The value for kty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    public final Builder kty(java.util.Optional<java.lang.String> kty) {
      checkNotIsSet(ktyIsSet(), "kty");
      this.kty = kty.orElse(null);
      optBits |= OPT_BIT_KTY;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#e() e} to e.
     * @param e The value for e
     * @return {@code this} builder for chained invocation
     */
    public final Builder e(java.lang.String e) {
      checkNotIsSet(eIsSet(), "e");
      this.e = java.util.Objects.requireNonNull(e, "e");
      optBits |= OPT_BIT_E;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#e() e} to e.
     * @param e The value for e
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    public final Builder e(java.util.Optional<java.lang.String> e) {
      checkNotIsSet(eIsSet(), "e");
      this.e = e.orElse(null);
      optBits |= OPT_BIT_E;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#d() d} to d.
     * @param d The value for d
     * @return {@code this} builder for chained invocation
     */
    public final Builder d(java.lang.String d) {
      checkNotIsSet(dIsSet(), "d");
      this.d = java.util.Objects.requireNonNull(d, "d");
      optBits |= OPT_BIT_D;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#d() d} to d.
     * @param d The value for d
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("d")
    public final Builder d(java.util.Optional<java.lang.String> d) {
      checkNotIsSet(dIsSet(), "d");
      this.d = d.orElse(null);
      optBits |= OPT_BIT_D;
      return this;
    }

    /**
     * Builds a new {@link JsonWebKey JsonWebKey}.
     * @return An immutable instance of JsonWebKey
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.JsonWebKey build() {
      return new ImmutableJsonWebKey(
          qi,
          implicitRules,
          dq,
          kid,
          active,
          x5c,
          alg,
          n,
          meta,
          x5t,
          language,
          dp,
          key_ops,
          p,
          q,
          id,
          use,
          resourceType,
          kty,
          e,
          d);
    }

    private boolean qiIsSet() {
      return (optBits & OPT_BIT_QI) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean dqIsSet() {
      return (optBits & OPT_BIT_DQ) != 0;
    }

    private boolean kidIsSet() {
      return (optBits & OPT_BIT_KID) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean x5cIsSet() {
      return (optBits & OPT_BIT_X5C) != 0;
    }

    private boolean algIsSet() {
      return (optBits & OPT_BIT_ALG) != 0;
    }

    private boolean nIsSet() {
      return (optBits & OPT_BIT_N) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean x5tIsSet() {
      return (optBits & OPT_BIT_X5T) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dpIsSet() {
      return (optBits & OPT_BIT_DP) != 0;
    }

    private boolean key_opsIsSet() {
      return (optBits & OPT_BIT_KEY_OPS) != 0;
    }

    private boolean pIsSet() {
      return (optBits & OPT_BIT_P) != 0;
    }

    private boolean qIsSet() {
      return (optBits & OPT_BIT_Q) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean ktyIsSet() {
      return (optBits & OPT_BIT_KTY) != 0;
    }

    private boolean eIsSet() {
      return (optBits & OPT_BIT_E) != 0;
    }

    private boolean dIsSet() {
      return (optBits & OPT_BIT_D) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of JsonWebKey is strict, attribute is already set: ".concat(name));
    }
  }
}
